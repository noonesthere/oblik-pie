#!/bin/bash

set -e

docker-compose -f ./docker-compose.yml --env-file ./local.env --project-name=oblik-pie  stop
