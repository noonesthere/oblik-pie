package oblik.protocol.adapters.rest

import klite.annotations.GET
import oblik.protocol.scenarios.inbound.GetProtocolStatuses

class GetProtocolStatusesRoute(private var getProtocolStatuses: GetProtocolStatuses) {

  @GET
  fun getStatuses() = getProtocolStatuses.execute()
    .map {
      ProtocolStatusWebModel(it.id, it.title)
    }.toList()
}

data class ProtocolStatusWebModel(val id: Int, val value: String)
