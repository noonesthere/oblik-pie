package oblik.common.types.base

import java.time.Instant

open class DomainEntity<T> protected constructor(
  val id: T,
  var updatedAt: Instant
) {

  private var events = ArrayList<DomainEvent>()

  protected fun addEvent(event: DomainEvent) {
    if (events.isEmpty()) {
      updatedAt = Instant.now()
    }
    events.add(event)
  }

  fun popEvents(): List<DomainEvent> {
    val res = events
    events = ArrayList()
    return res
  }
}
