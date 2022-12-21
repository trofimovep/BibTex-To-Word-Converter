package xyz.notifier.notificationservice.messaging

import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Sink
import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.Message
import org.springframework.stereotype.Service

@Service
@EnableBinding(Sink::class, Source::class)
class MessageProcessor {

    @StreamListener(target = Sink.INPUT, condition = "headers['event-'] == 'b2w-converter'")
    fun receive(message: Message<*>) {
        println("dlskncdkjscnskdncsdkcnksdcnsdkljcndsjklvbhjkdfvbdfljhvbdfljkvbk;djfnvkldjfbvjhdfbv")
    }

}