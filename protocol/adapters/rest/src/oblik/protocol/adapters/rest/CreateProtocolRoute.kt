package oblik.protocol.adapters.rest

import klite.annotations.POST
import oblik.protocol.domain.ProtocolStatus
import oblik.protocol.scenarios.dto.NewProtocolInput
import oblik.protocol.scenarios.inbound.CreateProtocol
import java.time.LocalDate

class CreateProtocolRoute(private val createProtocol: CreateProtocol) {

  @POST
  fun create(body: CreatingProtocolWebModel) {
    val protocol = body.to()
    println(protocol)
    createProtocol.execute(protocol)
  }
}

data class CreatingProtocolWebModel(val protocolNo: String, val startDate: String, val status: Int) {
  fun to() = NewProtocolInput(
    protocolNo = protocolNo,
    beginAt = LocalDate.parse(startDate),
    status = ProtocolStatus.fromId(status)
  )
}
