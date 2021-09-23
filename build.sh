#!/bin/bash

build_command="mvn clean package"
home_directory=$(pwd)

m1="SR-gen1"
m2="SR-gen2"
m3="SR-gen3"
m4="SR-gen4"

echo "build apps"

cd  ${home_directory}/${m1}
${build_command}

cd  ${home_directory}/${m1}
${build_command}

cd  ${home_directory}/${m1}
${build_command}

cd  ${home_directory}/${m1}
${build_command}