#!/usr/bin/env bash
#!/bin/bash
set -x
cd ..

$(aws --profile personal ecr get-login --region us-east-1)

docker tag greeting-api:latest $REPO_URL
docker push $REPO_URL
