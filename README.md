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
	
## Example

### generate pem key pairs

- generate private key:    ``$ openssl genrsa -out prikey.pem 1024``
- export public key from private key:   ``$ openssl rsa -in prikey.pem -pubout -out pubkey.pem``

### display pem key in bigint hex format

```

	$ java -jar pemkey-0.1.0-all.jar /tmp/prikey.pem
RSA Private CRT Key
            modulus: bc49bde6e795ff77a4e79e1fe33b9af612cf408989ee5ab75e1e9af44b502766402a67fb4ddefd1a9fcd92b18beb865961bb1e290fbd968cefee0203e3dadab9406e9eb595f844bc4833f99ebdadfe85f47fcc7eeb5d8bc35ba91b6953ccf311e845f0aa6a9bd5a42f12a88067b2ffebe6e21eff63911cebd437867f343a6c2d
    public exponent: 10001
   private exponent: 7b036e976a1c3ca0ad5349a2a9b1ea86f439058016666c4c3aa8a23212f656175eba95dec0bc7bfe260387e0897aa1f6c97c17b359fe525ad7f256ccb5d3e96b59b3bffb0b914de371310c0153432f736f8a8d1494625b738d724e6ab4b31759bacfb1dfa8fb076386cc357961ab6010fd1a221351c8421e6c33c4089c1a58bd
             primeP: e067ec0204a662f87e40d8b6921400b917880a8ba3566b522dd90908ee1b87d8896c5d8a98cf70e4460f08c13133c9b540d2d1b8a823b697854f764d9b38a697
             primeQ: d6cc0d767edc5cfc74eb9e29d141bcf2f2f24a062a811603f03fa0a6b3ec3103a7a10100c5944f1733974a43388c950e1c49569b512472039a4823281bb97fdb
     primeExponentP: bb88fda9de1af2e0fa19d542162813469b8cbc4b60104b961ceca0e94e9bc1564bda3cfe23a05096e49991d669f8fe9bb3f5bb0057bba8cf4dc04f7ca1b8a137
     primeExponentQ: ce7dedf75b6fc7289fd21f03be7a7f05e40e8ea12cdd59e7c15fb9b668c3883f26383eb99a37c06ce298efb87db59059b751bda3a4b6efb08cf20a72356cf7ff
     crtCoefficient: a6f28ef3a9f79a1cf6762c70072dd05c0c010485c21978921445dd64c8d4074eb83c3bf26c504b363fc9a8878a26f294a3c50a885ce11c503198afc3b4299e7f
```     