package com.example.pokeapp.framework

import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.PolymorphicKind
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

//@Serializer(forClass = List::class)
//object AnyListSerializer : KSerializer<List<Any>> {
//    override val descriptor: SerialDescriptor =
//        ListSerializer(AnyListSerializer).descriptor
//
//    override fun serialize(encoder: Encoder, value: List<Any>) {
//        encoder.encodeSerializableValue(ListSerializer(), value)
//    }
//
//    override fun deserialize(decoder: Decoder): List<Any> {
//        return decoder.decodeSerializableValue(ListSerializer(AnyListSerializer))
//    }
//}

@Serializer(forClass = List::class)
object AnyListSerializer : KSerializer<List<Any>> {
    @OptIn(InternalSerializationApi::class)
    override val descriptor: SerialDescriptor = buildSerialDescriptor("List", PolymorphicKind.OPEN)

    override fun serialize(encoder: Encoder, value: List<Any>) {
        encoder.encodeSerializableValue(PolymorphicSerializer(Any::class), value)
    }

    override fun deserialize(decoder: Decoder): List<Any> {
        return decoder.decodeSerializableValue(PolymorphicSerializer(Any::class)) as List<Any>
    }
}