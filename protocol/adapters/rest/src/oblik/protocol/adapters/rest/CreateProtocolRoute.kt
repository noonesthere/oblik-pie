package oblik.protocol.adapters.rest

import klite.annotations.GET
import oblik.protocol.scenarios.inbound.CreateProtocol

class CreateProtocolRoute(private val createProtocol: CreateProtocol) {

  @GET
  fun create() {
    TODO()
  }
}
