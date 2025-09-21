#!/bin/bash
set -e

docker-compose -f ./docker-compose.yml --env-file ./local.env --project-name=oblik-pie --profile local down -v
docker-compose -f ./docker-compose.yml --env-file ./local.env --project-name=oblik-pie --profile local rm -f
