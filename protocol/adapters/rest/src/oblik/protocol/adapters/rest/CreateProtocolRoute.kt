package oblik.protocol.adapters.rest

import klite.annotations.POST
import oblik.protocol.scenarios.inbound.CreateProtocol

class CreateProtocolRoute(private val createProtocol: CreateProtocol) {

  @POST
  fun create(body: CreatingProtocolWebModel) {
    println(body)
  }
}

data class CreatingProtocolWebModel(val protocolNo: String, val startDate: String, val status: Int)
