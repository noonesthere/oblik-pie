package oblik.protocol.domain

import oblik.common.types.base.DomainEvent

data class ProtocolCreatedDomainEvent(val protocolId: Int) : DomainEvent()
data class ProtocolEntryAddedToProtocolDomainEvent(val protocolEntryId: ProtocolEntryId) : DomainEvent()
data class ProtocolEntryRemovedFromProtocolDomainEvent(val protocolEntryId: ProtocolEntryId) : DomainEvent()
