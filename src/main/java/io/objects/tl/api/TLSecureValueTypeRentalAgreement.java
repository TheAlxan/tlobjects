package io.objects.tl.api;

import static io.objects.tl.StreamUtils.*;
import static io.objects.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

/**
 * This class is generated by Mono's TL class generator
 */
public class TLSecureValueTypeRentalAgreement extends TLAbsSecureValueType {
    public static final int CONSTRUCTOR_ID = 0x8b883488;

    private final String _constructor = "secureValueTypeRentalAgreement#8b883488";

    public TLSecureValueTypeRentalAgreement() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}