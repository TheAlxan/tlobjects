package io.objects.tl.mtproto.tl.auth

import io.objects.tl.StreamUtils.*
import io.objects.tl.TLContext
import io.objects.tl.core.TLLongVector
import io.objects.tl.core.TLObject
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream

class ResPQ @JvmOverloads constructor(var nonce: ByteArray = ByteArray(0),
                                      var serverNonce: ByteArray = ByteArray(0),
                                      var pq: ByteArray = ByteArray(0),
                                      var fingerprints: TLLongVector = TLLongVector()) : TLObject() {

    override fun getConstructorId(): Int {
        return CONSTRUCTOR_ID
    }

    @Throws(IOException::class)
    override fun serializeBody(stream: OutputStream) {
        writeByteArray(nonce, stream)
        writeByteArray(serverNonce, stream)
        writeTLBytes(pq, stream)
        writeTLVector(fingerprints, stream)
    }

    @Throws(IOException::class)
    override fun deserializeBody(stream: InputStream, context: TLContext) {
        nonce = readBytes(16, stream)
        serverNonce = readBytes(16, stream)
        pq = readTLBytes(stream)
        fingerprints = readTLLongVector(stream, context)
    }

    override fun toString(): String {
        return "resPQ#05162463"
    }

    companion object {
        @JvmField
        val CONSTRUCTOR_ID = 85337187
    }
}
