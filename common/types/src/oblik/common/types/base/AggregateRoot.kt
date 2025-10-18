package oblik.common.types.base

import java.time.Instant

@Suppress("UnnecessaryAbstractClass")
abstract class AggregateRoot<T>(id: T, updatedAt: Instant) : DomainEntity<T>(id, updatedAt)
