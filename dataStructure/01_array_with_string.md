# 해시테이블(Hash table)

- 효율적인 탐색을 위한 자료구조 → 키를 값에 대응시킴

- 연결 리스트와 해시 코드 함수로 구현

## 키와 값을 해시테이블에 넣는 과정

1. 키의 해시 코드를 계산

    - 키의 자료형은 int 혹은 long

    - 키의 개수는 무한한데 비해 int의 개수는 유한함

        → 서로 다른 두 개의 키가 같은 해시 코드를 가리킬 수 있음

2. 해시 코드를 이용해 배열의 인덱스를 구함

    - `hash(key) % array_length`

    - 서로 다른 두 개의 해시 코드가 같은 인덱스를 가리킬 수도 있음

3. 키와 값을 해당 인덱스에 저장

    - 배열의 각 인덱스에 키와 값으로 이루어진 연결리스트가 존재함

    - 충돌에 대비해 반드시 연결리스트를 이용

        - 충돌: 서로 다른 두 개의 키가 같은 해시 코드를 가리키거나 서로 다른 두 개의 해시 코드가 같은 인덱스를 가리키는 경우

### 시간 복잡도

- 최악: O(N)

- 최선: O(1) ← 충돌을 최소화하도록 잘 구현된 경우

### 균형 이진 탐색 트리(Balanced Binary Search Tree) 이용

- 탐색 시간: O(log N)

- 미리 배열을 할당하지 않아도 되므로 적은 공간을 사용(잠재적)

- 키의 집합을 특정 순서대로 차례대로 접근할 수 있음 → 유용

---

# ArrayList와 가변 크기 배열

- 데이터를 덧붙일 때마다 배열 혹은 리스트의 크기가 증가

- 특정 언어에서는 배열의 길이가 고정 → 배열을 만들 때 배열의 크기를 함께 지정

## ArrayList

- 동적 가변 크기 기능이 내재되어 있는 배열과 비슷한 자료 구조를 원할 때 사용

- 필요에 따라 크기를 변화시킬 수 있으면서도 **O(1)**의 접근 시간을 유지

- 배열이 가득 차는 순간 배열의 크기를 두 배로 늘림 → O(N)

    - 자주 발생하는 일이 아니므로 상환 입력 시간으로 계산 → O(1)

    ArrayList merge(String[] words, String[] more) {
    	ArrayList sentence = new ArrayList();
    	for (String w : words) sentence.add(w);
    	for (String w : more) sentence.add(w);
    	return sentence;
    }

### 상환 입력 시간이 O(1)이 되는 이유

- N개의 원소를 삽입할 때 소요되는 작업 → O(N)

- 배열의 상황에 따라 최악의 경우 O(N)이 소요되는 삽입 연산이 존재하기도

- 평균적으로 각 삽입은 O(1)이 소요

---

# StringBuilder

- 가변 크기 배열을 이용해 필요한 경우에만 문자열을 복사

    String joinWords(String[] words) {
    	StringBuilder sentence = new StringBuilder();
    	for (String w : words) {
    		sentence.append(w)
    	}
    	return sentence.toString();
    }

## StringBuilder의 필요성

    String joinWords(String[] words) {
    	String sentence = "";
    	for (String w: words) {
    		sentence = sentence + w;
    	}
    	return sentence;
    }

- StringBuilder를 이용하지 않은 위 식의 시간 복잡도는 O(xn^2) 혹은 O(n^2)

- 문자열을 이어 붙일 때마다 두 개의 문자열을 읽고 문자를 새로운 문자열에 복사

    - 처음에 x개, 두 번째에 2x개, 세 번째에 3x개, n 번째에는 nx개의 문자를 복사

    - 총 수행 시간 → O(x + 2x + ... + nx) → O(xn^2)
