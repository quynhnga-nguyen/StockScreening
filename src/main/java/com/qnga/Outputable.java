package com.qnga;

import java.io.IOException;
import java.util.List;

public interface Outputable {
    public void write(List<Data> data) throws IOException;
}
