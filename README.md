### 바로가기

- [proto files](https://github.com/my-research/protobuf/tree/master/src/main/proto)
- [Person 을 만들고 java class 생성하기](https://github.com/my-research/protobuf/blob/master/src/test/java/com/github/dhslrl321/app/step1/PersonTest.java)
- [좀 더 복잡한 스키마의 proto](https://github.com/my-research/protobuf/blob/master/src/test/java/com/github/dhslrl321/app/step2/AddressBookTest.java)
- [proto 객체의 serialization/deserialization](https://github.com/my-research/protobuf/blob/master/src/test/java/com/github/dhslrl321/app/step3/Byte_SerializeTest.java)

# Protobuf

protocol buffers is language, platform neutral data serialization format by google

- faster and compact by using binary format
- provide forward & backward compatibility methodology

> NOTE! protobuf 는 단지 forward, backward compatibility 를 **지원할 수 있는 방법**을 알려주며 language, platform neutral 한 serialization/deserialization 도구일 뿐 그 자체로 버전 관리나 schema 관리를 하지 않는다

# how it works?

<img width="655" alt="image" src="https://github.com/my-research/protobuf/assets/48385288/f4a50f1e-7ed6-4969-a25c-ec42aac990a7">

# put it to use

If you want to use it simply, follow these steps

1. define your data schema (called `.proto`)
2. generate programming language code from schema file
3. use

## with gradle

```shell
./gradlew clean build
```

or

```shell
./gradlew generateProto
```

## without gradle, use raw proto compiler

```shell
brew install protobuf
```

```shell
protoc --java_out={output location} {input location}

protoc --java_out=src/main/java ./proto/person.proto
```

## version supports

- [https://protobuf.dev/support/version-support/#java](https://protobuf.dev/support/version-support/#java)

### Ref

- [https://protobuf.dev](https://protobuf.dev)
- [https://github.com/google/protobuf-gradle-plugin](https://github.com/google/protobuf-gradle-plugin)

# 후기

- 음.. 일단 그냥 oas 하는거랑 똑같다
  - 일단 swagger 로 oas 를 먼저 해봐서 그런지 사용법에 대해서는 거부감이 없었다. gradle 설정하는데 좀 애를 먹긴 했는데,,
- 그리고 이건 s/d 와 버전 호환에 대한 방법을 제시할 뿐 그 자체가 버전관리를 하지는 않는다
- OuterClass 로 static class 접근하는 코드들이 default 라서 좀 귀찮다? 쉽게 잘 안읽힌다
  - 옵션이 있긴 해도 static class 접근하는게 귀찮다
- Don’t go looking for facilities similar to class inheritance, though – protocol buffers don’t do that.
- Protocol buffer classes are basically data holders, that don’t provide additional functionality
  - if you want to more rich class, adapting the proto class
- 관건은 byte 를 어떻게 전달하고 받을것인지에만 집중하면 될것 같다
