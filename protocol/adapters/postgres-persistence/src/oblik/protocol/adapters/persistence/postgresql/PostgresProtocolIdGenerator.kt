package oblik.protocol.adapters.persistence.postgresql

import klite.jdbc.exec
import oblik.protocol.domain.ProtocolId
import oblik.protocol.domain.ProtocolIdGenerator
import javax.sql.DataSource

class PostgresProtocolIdGenerator(val db: DataSource) : ProtocolIdGenerator {
  override fun generate(): ProtocolId {
    val value = db.exec("SELECT nextval('protocol_id_seq');")
    return ProtocolId(value)
  }
}
