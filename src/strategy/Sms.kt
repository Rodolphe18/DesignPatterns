package strategy

import strategy.compress.CompressionStrategy
import strategy.encrypt.EncryptionStrategy

class Sms(encryptionStrategy: EncryptionStrategy, compressionStrategy: CompressionStrategy): Notification(encryptionStrategy,compressionStrategy) {
    override fun send() {
        println("Sms")
    }


}