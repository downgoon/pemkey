# display pem key file in bigint hex format

## how to run

``java -jar pemkey-0.1.0-all.jar $path-to-file.pem``

for help, run ``java -jar pemkey-0.1.0-all.jar``

for example ``java -jar pemkey-0.1.0-all.jar /tmp/passport-pri-1024-test.pem``

**NOTE**

a precompiled package is available at [v0.1.0 Releases](https://github.com/downgoon/pemkey/releases/tag/v0.1.0), you can go to this page and download it directly.

## how to build

	git clone https://github.com/downgoon/pemkey.git
	cd pemkey
	mvn clean package
	java -jar target/pemkey-0.1.0-all.jar $path-to-file.pem
	
