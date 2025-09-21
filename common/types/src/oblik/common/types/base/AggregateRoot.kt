package oblik.common.types.base

@Suppress("UnnecessaryAbstractClass")
abstract class AggregateRoot<T>(id: T, version: Version) : DomainEntity<T>(id, version)
