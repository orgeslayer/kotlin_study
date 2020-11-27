package toc7

/**
 * Supervision
 *

 앞에서 살펴본 것 처럼, 취소는 코루틴 전체 계층구조를 통해 전파되는 양방향 관계입니다.
 이제부터는 단방향으로 취소가 필요한 경우를 살펴보겠습니다.

 특정 스코프 내에서 동작하는 작업을 가진 UI 컴포넌트는 이러한 필요성을 가진 좋은 예시입니다.
 UI의 하위 작업중 하나라도 실패하면, UI 구성 요소 전체를 취소 (효과적으로 제거)하는 것은 아니지만,
 UI 구성요소가 소멸(=destroyed)되어 그 작업(=UI 종속적안 작업)이 취소되면, 더 이상 결과가 필요하지 않으므로
 모든 하위 작업을 실패해야 합니다.

 또다른 예로 여러개의 하위 작업들을 발생시키고 이들의 작업을 감독해야하는 서버 프로세스로,
 이들의 실패를 추적하여 실패한 하위 작업만 재시작해야 하는 경우입니다.
 */