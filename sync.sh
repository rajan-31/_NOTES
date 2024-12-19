#!/bin/bash

git add . && git commit -m "sync $(date +"%d/%m/%Y %T")" && git push origin main
