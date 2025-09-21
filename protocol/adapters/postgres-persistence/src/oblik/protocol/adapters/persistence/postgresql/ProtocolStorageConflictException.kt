package oblik.protocol.adapters.persistence.postgresql

class ProtocolStorageConflictException(override val message: String? = null, cause: Throwable? = null) :
  RuntimeException(message, cause, true, false)
