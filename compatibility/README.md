# Extending Protobuf 

- new buffers : to be backward compatibility
- old buffers : to be forward compatibility


## compatibility

<img width="711" alt="image" src="https://github.com/my-research/protobuf/assets/48385288/50dec35d-6599-49d5-aebd-621f72c1d200">

- backward : 새로운 (newer) 버전의 reader 가 기존의 (older) 버전의 writer 에서 생산한 메시지를 호환한다
- forward : 기존의 (older) 버전의 reader 가 새로운 (newer) 버전의 writer 에서 생산한 메시지를 호환한다

## protobuf 를 사용하면서 compatibility 룰 위해 지켜야할 몇가지 규칙

- **you must not change the tag numbers of any existing fields.**
  - tag number 는 변경되지 않아야 한다
  - tag 는 유일한 수여야 하고 protoc 가 tag number 로 field 를 wiring 하기 때문에
- **you must not add or delete any required fields.**
  - required field 를 추가하거나 삭제하지 않아야 한다
  - 양방향으로 호환성을 깨는 행위
- **you may delete optional or repeated fields.**
- **you may add new optional or repeated fields, but you must use fresh tag numbers (that is, tag numbers that were never used in this protocol buffer, not even by deleted fields).**
