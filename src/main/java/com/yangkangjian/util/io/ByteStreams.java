package com.yangkangjian.util.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by scott on 2017/6/1.
 */
public final class ByteStreams {
    private ByteStreams() {

    }

    static byte[] createBuffer() {
        return new byte[8192];
    }

    public static Long copy(InputStream input, OutputStream out) throws IOException {
        byte buff[] = createBuffer();
        Long total = 0L;
        while (true) {
            int r = input.read(buff);
            if (r == -1) {
                break;
            }
            out.write(buff, 0, r);
            total += r;
        }
        return total;
    }

}
