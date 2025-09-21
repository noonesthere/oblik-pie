--changeset protocols
CREATE TABLE IF NOT EXISTS protocols(
    id INTEGER PRIMARY KEY NOT NULL,
    protocolNumber VARCHAR(100) NOT NULL,
    status INTEGER NOT NULL,
    beginAt DATE NOT NULL,
  ${createdAt},
  ${updatedAt},
    ${deletedAt},
    chiefMember VARCHAR(100) NOT NULL DEFAULT '',
    secretaryMember VARCHAR(100) NOT NULL DEFAULT '',
    member0 VARCHAR(100) NOT NULL DEFAULT '',
    member1 VARCHAR(100) NOT NULL DEFAULT '',
    member2 VARCHAR(100) NOT NULL DEFAULT '',
    member3 VARCHAR(100) NOT NULL DEFAULT '',
    member4 VARCHAR(100) NOT NULL DEFAULT '',
    member5 VARCHAR(100) NOT NULL DEFAULT '',
    member6 VARCHAR(100) NOT NULL DEFAULT '',
    member7 VARCHAR(100) NOT NULL DEFAULT '',
    member8 VARCHAR(100) NOT NULL DEFAULT '',
    member9 VARCHAR(100) NOT NULL DEFAULT ''
);

--changeset protocols.sequence
CREATE SEQUENCE IF NOT EXISTS protocol_id_seq;

--changeset protocols_number_idx
create unique index protocols_number_idx on protocols (protocolNumber);
