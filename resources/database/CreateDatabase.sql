-- Table: "camps"

DROP TABLE "camps";

CREATE TABLE "camps"
(
    "camp_id" bigserial NOT NULL,
    "description" text COLLATE pg_catalog."default",
    "start" date,
    "end" date,
    CONSTRAINT "camp_pkey" PRIMARY KEY ("camp_id")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE "camps"
    OWNER to postgres;

GRANT ALL ON TABLE "camps" TO danielz;

GRANT ALL ON TABLE "camps" TO postgres;




INSERT INTO "camps"(
	"description", "start", "end")
	VALUES ('Junior 2', '2017-07-07', '2017-07-12');
        