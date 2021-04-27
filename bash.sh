#!/usr/bin/env bash

rm build/libs/*.jar
./gradlew build

exist() {
	cp build/libs/*.jar project
}

doesNotExist() {
	echo compile failed
}

if [ build/libs/*.jar -e file ]; then
	exist
else
	doesntExist
fi
