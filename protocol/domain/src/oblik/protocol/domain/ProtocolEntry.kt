package oblik.protocol.domain

import oblik.common.types.Address
import oblik.common.types.DocumentIdNo
import oblik.common.types.ExceptionalReason
import oblik.common.types.Phone
import oblik.common.types.Rank
import java.time.LocalDate

class ProtocolEntry(
  private val  id: Int,
  private val  protocolId: Int,
  private val  orderNumber: Int,
  private val  personId: Int,
  private val  reason: ExceptionalReason,
  private val  createdAt: LocalDate,
  private val  expiredAt: LocalDate,
  private val  rank: Rank,
  private val  address: Address,
  private val  phone: Phone,
  private val  documentIdNo: DocumentIdNo,
  private val status: ProtocolEntryStatus
) {

}

enum class ProtocolEntryStatus {

}
