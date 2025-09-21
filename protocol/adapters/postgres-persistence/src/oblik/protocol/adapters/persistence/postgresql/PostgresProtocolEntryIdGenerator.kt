package oblik.protocol.adapters.persistence.postgresql

import klite.jdbc.exec
import oblik.protocol.domain.ProtocolEntryId
import oblik.protocol.domain.ProtocolEntryIdGenerator
import javax.sql.DataSource

class PostgresProtocolEntryIdGenerator(val db: DataSource) : ProtocolEntryIdGenerator {
  override fun generate(): ProtocolEntryId {
    val value = db.exec("SELECT nextval('protocol_entry_id_seq');")
    return ProtocolEntryId(value)
  }
}
