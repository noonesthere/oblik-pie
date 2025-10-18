--substitute createdAt=createdAt timestamptz default current_timestamp
--substitute updatedAt=updatedAt timestamptz default current_timestamp
--substitute deletedAt=deletedAt timestamptz default NULL

--include protocol.protocols.sql
