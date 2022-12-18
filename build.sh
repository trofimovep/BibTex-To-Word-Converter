#!/bin/bash
echo "......................................................"

echo "Starting building the discovery service application..."
./discovery-service/gradlew discovery-service clean build
echo "Discovery service application is built!"

echo "Starting building the gateway application..."
./gateway/gradlew -p gateway clean build
echo "Gateway service application is built!"

echo "Starting building the converter application..."
./b2w-converter/gradlew -p b2w-converter clean build
echo "Converter service application is built!"

echo "......................................................"