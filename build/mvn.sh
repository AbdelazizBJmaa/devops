#!/bin/bash
cd  demo && docker run --rm -v $PWD:/app -v /root/.m2:/root/.m2 -w /app maven $@
