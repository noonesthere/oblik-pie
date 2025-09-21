package oblik.protocol.adapters.persistence.postgresql

import klite.jdbc.BaseCrudRepository
import javax.sql.DataSource

class ProtocolRepository(db: DataSource) : BaseCrudRepository<ProtocolEntity, Int>(db, "protocols")
