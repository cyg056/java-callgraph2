package com.adrninistrator.javacg.dto.element.constant;

import com.adrninistrator.javacg.common.enums.JavaCGConstantTypeEnum;

/**
 * @author adrninistrator
 * @date 2022/5/14
 * @description:
 */
public class ConstElementByte extends ConstElement {

    public ConstElementByte(Object value) {
        super(value);
    }

    @Override
    public JavaCGConstantTypeEnum getConstantTypeEnum() {
        return JavaCGConstantTypeEnum.CONSTTE_BYTE;
    }
}