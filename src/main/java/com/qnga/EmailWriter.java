package com.qnga;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class EmailWriter implements Outputable {
    @Override
    public void write(List<Data> stockData) throws IOException {
        Email from = new Email("StockScreening@example.com");
        String subject = "Picked Stocks";
        Email to = new Email("qnga.personal@gmail.com");

        StringBuilder builder = new StringBuilder("List of picked stocks:" + System.lineSeparator());
        for (Data stock : stockData) {
            builder.append(stock.getSymbol());
            builder.append(System.lineSeparator());
        }

        Content content = new Content("text/plain", builder.toString());
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");
        request.setBody(mail.build());
        Response response = sg.api(request);

        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        System.out.println(response.getHeaders());
    }
}
