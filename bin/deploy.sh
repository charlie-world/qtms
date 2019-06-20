#!/usr/bin/env bash

set -e

# Build Docker Image
if [ -z "$TRAVIS_PULL_REQUEST" ] || [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
    if [ ! -z "$TRAVIS_TAG" ] || [ "$TRAVIS_BRANCH" == "master" ] || [ "$TRAVIS_BRANCH" == "develop" ]; then
        docker build -t $DOCKER_REPO .
        docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"

        # Push the Docker Image
        if [ ! -z "$TRAVIS_TAG" ]; then
            docker tag $DOCKER_REPO $DOCKER_REPO:$TRAVIS_TAG
            docker push $DOCKER_REPO:$TRAVIS_TAG
        fi

        if [ "$TRAVIS_BRANCH" == "master" ]; then
            docker tag $DOCKER_REPO $DOCKER_REPO:latest
            docker push $DOCKER_REPO:latest
        elif [ "$TRAVIS_BRANCH" == "develop" ]; then
            develop_tag=develop-$TRAVIS_COMMIT

            docker tag $DOCKER_REPO $DOCKER_REPO:$develop_tag
            docker push $DOCKER_REPO:$develop_tag

            docker tag $DOCKER_REPO $DOCKER_REPO:canary
            docker push $DOCKER_REPO:canary
        fi
    fi
fi
