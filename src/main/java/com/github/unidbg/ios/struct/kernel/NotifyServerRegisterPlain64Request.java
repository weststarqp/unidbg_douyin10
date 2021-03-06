package com.github.unidbg.ios.struct.kernel;

import com.github.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class NotifyServerRegisterPlain64Request extends UnicornStructure {

    public NotifyServerRegisterPlain64Request(Pointer p) {
        super(p);
    }

    public int pad1;
    public int nameLow;
    public int nameHigh;
    public int pad2;
    public int nameCnt;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("pad1", "nameLow", "nameHigh", "pad2", "nameCnt");
    }

}
