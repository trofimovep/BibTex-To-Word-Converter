#!/bin/bash
echo "......................................................"

echo "Starting building the discovery service application..."
./discovery-service/gradlew -p discovery-service clean build
echo "Discovery service application is built!"

echo "......................................................"

echo "Starting building the gateway application..."
./gateway/gradlew -p gateway clean build
echo "Gateway service application is built!"

echo "......................................................"

echo "Starting building the converter application..."
./b2w-converter/gradlew -p b2w-converter clean build
echo "Converter service application is built!"

echo "......................................................"

echo "Starting building the notification service application..."
./notification-service/gradlew -p notification-service clean build
echo "Notification service application is built!"

echo "......................................................"