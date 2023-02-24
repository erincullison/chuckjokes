-- ********************************************************************************
-- This script creates the database users and grants them the necessary permissions
-- ********************************************************************************

CREATE USER chuck_jokes_owner
WITH PASSWORD 'pass';

GRANT ALL
ON ALL TABLES IN SCHEMA public
TO chuck_jokes_owner;

GRANT ALL
ON ALL SEQUENCES IN SCHEMA public
TO chuck_jokes_owner;

CREATE USER chuck_jokes_appuser
WITH PASSWORD 'pass';

GRANT SELECT, INSERT, UPDATE, DELETE
ON ALL TABLES IN SCHEMA public
TO chuck_jokes_appuser;

GRANT USAGE, SELECT
ON ALL SEQUENCES IN SCHEMA public
TO chuck_jokes_appuser;
