package io.objects.tl.mtproto.tl

import io.objects.tl.StreamUtils.readTLLongVector
import io.objects.tl.StreamUtils.writeTLVector
import io.objects.tl.TLContext
import io.objects.tl.core.TLLongVector
import io.objects.tl.core.TLObject
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

class MTNeedResendMessage @JvmOverloads constructor(var messages: TLLongVector = TLLongVector()) : TLObject() {

    constructor(msgIds: LongArray) : this() {
        messages.addAll(msgIds.toList())
    }

    constructor(msgIds: Array<Long>) : this() {
        messages.addAll(msgIds)
    }

    override fun getConstructorId(): Int {
        return CONSTRUCTOR_ID
    }

    @Throws(IOException::class)
    override fun serializeBody(stream: OutputStream) {
        writeTLVector(messages, stream)
    }

    @Throws(IOException::class)
    override fun deserializeBody(stream: InputStream, context: TLContext) {
        messages = readTLLongVector(stream, context)
    }

    override fun toString(): String {
        return "msg_resend_req#7d861a08"
    }

    companion object {
        @JvmField
        val CONSTRUCTOR_ID = 2105940488
    }
}
