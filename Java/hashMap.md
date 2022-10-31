#### MAP은 순서를 유지하지 않음

#### Hashmap(=Hashtable) : Set처럼 저장 순서가 없고, key 중복안됨, value 중복됨
- Map인터페이스를 구현, 데이터를 키와 값의 쌍으로 저장
- 데이터가 많아도 검색이 빠름
- list나 Set은 add, map은 put을 사용
- 해싱 : 해쉬함수를 이용하여 저장하고 읽어오는 것
- Hashtable = 배열의 장점인 접근성 + 링크드리스트 장점인 변경유리

#### 주요메서드
HashMap(배열 초기용량, 생성자) 
- put(key, value)
- putall(Map)
- remove(key)
- replace(key, value)

#### 읽어오는 메서드
- entrySet() : key, value 모두 읽어옴
- keySet() : key만 읽어옴
- values : value만 읽어옴

- get(key) : value를 반환
- getOrDefault(key, defaultValue) : key 존재시 대칭 value, key없을시 defaultvalue 반환
- containsKey(key) : key가 entry에 존재하는지 확인 (true, false)
- contaunsValue(value) : value가 entry에 존재하는지 확인(true, false)

size() : 크기 
isEmpty() : 공백
clear() : 삭제
clone() : 복제

#### Treemap(=TreeSet) : 이진탐색 트리
- 범의 검색과 정렬에 유리한 컬렉션 클래스
- HashMap보다 데이터 추가, 삭제에 시간이 더 걸린다.

#### LinkedHashMap : 순서를 유지함

#### import 목록
import java.util.HashMap;
import java.util.Map;
