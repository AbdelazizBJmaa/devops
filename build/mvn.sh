#!/bin/bash
cd  demo && sudo docker run --rm -v $PWD:/app -v /root/.m2:/root/.m2 -w /app maven $@
