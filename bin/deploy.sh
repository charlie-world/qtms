#!/usr/bin/env bash

set -e

# Build Docker Image
if [ -z "$TRAVIS_PULL_REQUEST" ] || [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
    if [ ! -z "$TRAVIS_TAG" ]; then
        docker build -t $DOCKER_REPO .
        docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"
        docker tag $DOCKER_REPO $DOCKER_REPO:$TRAVIS_TAG
        docker push $DOCKER_REPO:$TRAVIS_TAG
    fi
fi
