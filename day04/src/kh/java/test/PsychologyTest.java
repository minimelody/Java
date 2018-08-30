package kh.java.test;

import java.util.Scanner;

public class PsychologyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======재미로 보는 심리테스트 v1.0======");
		int num;
		System.out.print("START~ 연상보다는 연하의 사람이 말하기 편하다(1.Yes/2.No) : ");
		num = sc.nextInt();
		if(num==1) { //연상 연하질문 1번
			System.out.print("혼자서 여행 또는 출장을 가는 것은 재미가 없다(1.Yes/2.No) : ");
			num = sc.nextInt();
			if(num==1) { //여행 질문 1번
				System.out.print("공식행사나 친구들 사이에서 총무역할을 많이 한다(1.Yes/2.No) : ");
				num = sc.nextInt();
				if(num==1) { //총무 질문 1번
					System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //통화 질문 1번
						System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //한 곳 질문 1번
							System.out.println("매우 훌륭해 보이는 타입!");
							System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
							System.out.println("물론 이런 경우 관록은 중량이 아니라 인력을 말합니다.");
							System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
							System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질 수 있는 것이다.");
							System.out.println("때로는 여유를 보여주도록 합시다!");
						}else { //한 곳 질문 2번
							System.out.println("언제나 즐겁고 귀여운 타입!");
							System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
							System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
							System.out.println("원만한 성격이라는 말치레가 어울린다.");
							System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
							System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
						}
					}else { //통화 질문 2번
						System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //책상 질문 1번
							System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //농담 질문 1번
								System.out.println("왠지 까다롭게 느껴지는 타입!");
								System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
								System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
								System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
								System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
								System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
							}else { //농담 질문 2번
								System.out.println("유쾌하고 활발한 타입!");
								System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
								System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
								System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
								System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
								System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른 사람에게 의지해 보시기 바랍니다.");
							}
						}else { //책상 질문 2번
							System.out.println("왠지 까다롭게 느껴지는 타입!");
							System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
							System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
							System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
							System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
							System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
						}
					}
				}else { //총무 질문 2번
					System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //책상 질문 1번
						System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //농담 질문 1번
							System.out.println("왠지 까다롭게 느껴지는 타입!");
							System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
							System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
							System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
							System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
							System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
						}else { //농담 질문 2번
							System.out.println("유쾌하고 활발한 타입!");
							System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
							System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
							System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
							System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
							System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른 사람에게 의지해 보시기 바랍니다.");
						}
					}else { //책상 질문 2번
						System.out.println("왠지 까다롭게 느껴지는 타입!");
						System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
						System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
						System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
						System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
						System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
					}
				}
			}else { //여행 질문 2번
				System.out.print("성격이 급하다(1.Yes/2.No) : ");
				num = sc.nextInt();
				if(num==1) { //성격이 급하다 1번
					System.out.print("몸가짐에 항상 주의하는 편이다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //몸가짐 1번
						System.out.println("매우 훌륭해 보이는 타입!");
						System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
						System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
						System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
						System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질 수 있는 것이다.");
						System.out.println("때로는 여유를 보여주도록 합시다!");
					}else { //몸가짐 2번
						System.out.println("언제나 즐겁고 귀여운 타입!");
						System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
						System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
						System.out.println("원만한 성격이라는 말치레가 어울린다.");
						System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
						System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
					}
				}else { //성격이 급하다 2번
					System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //통화 1번
						System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //한곳 1번
							System.out.println("매우 훌륭해 보이는 타입!");
							System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
							System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
							System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
							System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질 수 있는 것이다.");
							System.out.println("때로는 여유를 보여주도록 합시다!");
						}else { //한곳 2번
							System.out.println("언제나 즐겁고 귀여운 타입!");
							System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
							System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
							System.out.println("원만한 성격이라는 말치레가 어울린다.");
							System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
							System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
						}
					}else { //통화 2번
						System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //책상 1번
							System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //농담 1번
								System.out.println("왠지 까다롭게 느껴지는 타입!");
								System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
								System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
								System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
								System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
								System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
							}else { //농담 2번
								System.out.println("유쾌하고 활발한 타입!");
								System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
								System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
								System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대로 거절하지 못하는 성격을 지니고 있다.");
								System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
								System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른 사람에게 의지해 보시기 바랍니다.");
							}
						}else { //책상 2번
							System.out.println("왠지 까다롭게 느껴지는 타입!");
							System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
							System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
							System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
							System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
							System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
						}
					}
				}
			}
		}else { //연상 연하질문 2번
			System.out.print("옷은 블랙계통의 세련된 것이 많은 편이다(1.Yes/2.No) : ");
			num = sc.nextInt();
			if(num==1) { //블랙 1번
				System.out.print("동창회는 반드시 참석한다(1.Yes/2.No) : ");
				num = sc.nextInt();
				if(num==1) { //동창회 1번
					System.out.print("무비카메라를 들이대면 자주 V(브이)싸인을 한다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //무비 1번
						System.out.print("다른 사람에게 무언가를 가르친다는 것은 괴롭다고 생각한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //가르침 1번
							System.out.print("다른 사람이 나의 실제 나이를 예측하지 못한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //나이 1번
								System.out.println("알쏭달쏭 불가사의한 타입!");
								System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
								System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
								System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
								System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
								System.out.println("바로 연기자 스타일이다.");
							}else { //나이 2번
								System.out.print("목소리가 크다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //목소리 1번
									System.out.println("유쾌하고 활발한 타입!");
									System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
									System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
									System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
									System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
									System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른 사람에게 의지해 보시기 바랍니다.");
								}else { //목소리 2번
									System.out.println("알쏭달쏭 불가사의한 타입!");
									System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
									System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
									System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
									System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
									System.out.println("바로 연기자 스타일이다.");
								}
							}
						}else { //가르침 2번
							System.out.print("목소리가 크다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //목소리 1번
								System.out.println("유쾌하고 활발한 타입!");
								System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
								System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
								System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
								System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
								System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른 사람에게 의지해 보시기 바랍니다.");
							}else { //목소리 2번
								System.out.println("알쏭달쏭 불가사의한 타입!");
								System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
								System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
								System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
								System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
								System.out.println("바로 연기자 스타일이다.");
							}
						}
					}else { //무비 2번
						System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //책상 1번
							System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //농담 1번
								System.out.println("왠지 까다롭게 느껴지는 타입!");
								System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
								System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
								System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
								System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
								System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
							}else { //농담 2번
								System.out.println("유쾌하고 활발한 타입!");
								System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
								System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
								System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
								System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
								System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
							}
						}else { //책상 2번
							System.out.println("왠지 까다롭게 느껴지는 타입!");
							System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
							System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
							System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
							System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
							System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
						}
					}
				}else { //동창회 2번
					System.out.print("키가 평균보다 작다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //키 1번
						System.out.print("공식행사나 친구들 사이에서 총무역할을 많이 한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //총무 1번
							System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //통화 1번
								System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //한곳 1번
									System.out.println("매우 훌륭해 보이는 타입!");
									System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
									System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
									System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
									System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질수 있는 것이다.");
									System.out.println("때로는 여유를 보여주도록 합시다!");
								}else { //한곳 2번
									System.out.println("언제나 즐겁고 귀여운 타입!");
									System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
									System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
									System.out.println("원만한 성격이라는 말치레가 어울린다.");
									System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
									System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
								}
							}else { //통화 2번
								System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //책상 1번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}else { //책상 2번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}
							}
						}else { //총무 2번
							System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //책상 1번
								System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //농담 1번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}else { //농담 2번
									System.out.println("유쾌하고 활발한 타입!");
									System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
									System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
									System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
									System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
									System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
								}
							}else { //책상 2번
								System.out.println("왠지 까다롭게 느껴지는 타입!");
								System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
								System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
								System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
								System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
								System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
							}
						}
					}else { //키 2번
						System.out.print("섹시한 편이다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //섹시 1번
							System.out.print("목소리가 크다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //목소리 1번
								System.out.println("유쾌하고 활발한 타입!");
								System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
								System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
								System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
								System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
								System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
							}else { //목소리 2번
								System.out.println("알쏭달쏭 불가사의한 타입!");
								System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
								System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
								System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
								System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
								System.out.println("바로 연기자 스타일이다.");
							}
						}else { //섹시 2번
							System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //농담 1번
								System.out.println("왠지 까다롭게 느껴지는 타입!");
								System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
								System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
								System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
								System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
								System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
							}else { //농담 2번
								System.out.println("유쾌하고 활발한 타입!");
								System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
								System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
								System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
								System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
								System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
							}
						}
					}
				}
			}else { //블랙 2번
				System.out.print("어릴때부터 여러가지 별명을 갖고 있다(1.Yes/2.No) : ");
				num = sc.nextInt();
				if(num==1) { //별명 1번
					System.out.print("태국, 인도네시아 등의 전통요리를 먹어본 적이 있다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //전통 1번
						System.out.print("머리 모양에 관심이 있다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //머리 1번
							System.out.print("무비카메라를 들이대면 자주 V(브이)싸인을 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //무비 1번
								System.out.print("다른 사람에게 무언가를 가르친다는 것은 괴롭다고 생각한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //가르침 1번
									System.out.print("다른 사람이 나의 실제나이를 예측하지 못한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //나이 1번
										System.out.println("알쏭달쏭 불가사의한 타입!");
										System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
										System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
										System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
										System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
										System.out.println("바로 연기자 스타일이다.");
									}else { //나이 2번
										System.out.print("목소리가 크다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //목소리 1번
											System.out.println("유쾌하고 활발한 타입!");
											System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
											System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
											System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
											System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
											System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
										}else { //목소리 2번
											System.out.println("알쏭달쏭 불가사의한 타입!");
											System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
											System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
											System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
											System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
											System.out.println("바로 연기자 스타일이다.");
										}
									}
								}else { //가르침 2번
									System.out.print("목소리가 크다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //목소리 1번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}else { //목소리 2번
										System.out.println("알쏭달쏭 불가사의한 타입!");
										System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
										System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
										System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
										System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
										System.out.println("바로 연기자 스타일이다.");
									}
								}
							}else { //무비 2번
								System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //책상 1번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}else { //책상 2번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}
							}
						}else { //머리 2번
							System.out.print("걸음이 느려 다른 사람보다 뒤쳐진다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //걸음 1번
								System.out.print("다른 사람에게 무언가를 가르친다는 것은 괴롭다고 생각한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //가르침 1번
									System.out.print("다른 사람이 나의 실제 나이를 예측하지 못한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //나이 1번
										System.out.println("알쏭달쏭 불가사의한 타입!");
										System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
										System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
										System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
										System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
										System.out.println("바로 연기자 스타일이다.");
									}else { //나이 2번
										System.out.print("목소리가 크다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //목소리 1번
											System.out.println("유쾌하고 활발한 타입!");
											System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
											System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
											System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
											System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
											System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
										}else { //목소리 2번
											System.out.println("알쏭달쏭 불가사의한 타입!");
											System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
											System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
											System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
											System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
											System.out.println("바로 연기자 스타일이다.");
										}
									}
								}else { //가르침 2번
									System.out.print("목소리가 크다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //목소리 1번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}else { //목소리 2번
										System.out.println("알쏭달쏭 불가사의한 타입!");
										System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
										System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
										System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
										System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
										System.out.println("바로 연기자 스타일이다.");
									}
								}
							}else { //걸음 2번
								System.out.print("섹시한 편이다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //섹시 1번
									System.out.print("목소리가 크다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //목소리 1번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}else { //목소리 2번
										System.out.println("알쏭달쏭 불가사의한 타입!");
										System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
										System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
										System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
										System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
										System.out.println("바로 연기자 스타일이다.");
									}
								}else { //섹시 2번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}
							}
						}
					}else { //전통 2번
						System.out.print("자주 물건을 잃어버린다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //물건 1번
							System.out.print("키가 평균보다 작다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //키 1번
								System.out.print("공식행사나 친구들 사이에서 총무역할을 많이 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //총무 1번
									System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //통화 1번
										System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //한곳 1번
											System.out.println("매우 훌륭해 보이는 타입!");
											System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
											System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
											System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
											System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질수 있는 것이다.");
											System.out.println("때로는 여유를 보여주도록 합시다!");
										}else { //한곳 2번
											System.out.println("언제나 즐겁고 귀여운 타입!");
											System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
											System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
											System.out.println("원만한 성격이라는 말치레가 어울린다.");
											System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
											System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
										}
									}else { //통화 2번
										System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //책상 1번
											System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
											num = sc.nextInt();
											if(num==1) { //농담 1번
												System.out.println("왠지 까다롭게 느껴지는 타입!");
												System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
												System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
												System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
												System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
												System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
											}else { //농담 2번
												System.out.println("유쾌하고 활발한 타입!");
												System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
												System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
												System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
												System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
												System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
											}
										}else { //책상 2번
											System.out.println("왠지 까다롭게 느껴지는 타입!");
											System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
											System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
											System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
											System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
											System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
										}
									}
								}else { //총무 2번
									System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //책상 1번
										System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //농담 1번
											System.out.println("왠지 까다롭게 느껴지는 타입!");
											System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
											System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
											System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
											System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
											System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
										}else { //농담 2번
											System.out.println("유쾌하고 활발한 타입!");
											System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
											System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
											System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
											System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
											System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
										}
									}else { //책상 2번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}
								}
							}else { //키 2번
								System.out.print("섹시한 편이다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //섹시 1번
									System.out.print("목소리가 크다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) {
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}else {
										System.out.println("알쏭달쏭 불가사의한 타입!");
										System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
										System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
										System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
										System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
										System.out.println("바로 연기자 스타일이다.");
									}
								}else { //섹시 2번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}
							}
						}else { //물건 2번
							System.out.print("공식행사나 친구들 사이에서 총무역할을 많이 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //총무 1번
								System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //통화 1번
									System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //한곳 1번
										System.out.println("매우 훌륭해 보이는 타입!");
										System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
										System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
										System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
										System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질수 있는 것이다.");
										System.out.println("때로는 여유를 보여주도록 합시다!");
									}else { //한곳 2번
										System.out.println("언제나 즐겁고 귀여운 타입!");
										System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
										System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
										System.out.println("원만한 성격이라는 말치레가 어울린다.");
										System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
										System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
									}
								}else { //통화 2번
									System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //책상 1번
										System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //농담 1번
											System.out.println("왠지 까다롭게 느껴지는 타입!");
											System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
											System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
											System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
											System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
											System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
										}else { //농담 2번
											System.out.println("유쾌하고 활발한 타입!");
											System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
											System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
											System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
											System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
											System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
										}
									}else { //책상 2번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}
								}
							}else { //총무 2번
								System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //책상 1번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}else { //책상 2번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}
							}
						}
					}
				}else { //별명 2번
					System.out.print("자주 물건을 잃어버린다(1.Yes/2.No) : ");
					num = sc.nextInt();
					if(num==1) { //물건 1번
						System.out.print("키가 평균보다 작다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //키 1번
							System.out.print("공식행사나 친구들 사이에서 총무역할을 많이 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //총무 1번
								System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //통화 1번
									System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다");
									num = sc.nextInt();
									if(num==1) { //한곳 1번
										System.out.println("매우 훌륭해 보이는 타입!");
										System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
										System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
										System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
										System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질수 있는 것이다.");
										System.out.println("때로는 여유를 보여주도록 합시다!");
									}else { //한곳 2번
										System.out.println("언제나 즐겁고 귀여운 타입!");
										System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
										System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
										System.out.println("원만한 성격이라는 말치레가 어울린다.");
										System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
										System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
									}
								}else { //통화 2번
									System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //책상 1번
										System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
										num = sc.nextInt();
										if(num==1) { //농담 1번
											System.out.println("왠지 까다롭게 느껴지는 타입!");
											System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
											System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
											System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
											System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
											System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
										}else { //농담 2번
											System.out.println("유쾌하고 활발한 타입!");
											System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
											System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
											System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
											System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
											System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
										}
									}else { //책상 2번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}
								}
							}else { //총무 2번
								System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //책상 1번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}else { //책상 2번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}
							}
						}else { //키 2번
							System.out.print("섹시한 편이다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //섹시 1번
								System.out.print("목소리가 크다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //목소리 1번
									System.out.println("유쾌하고 활발한 타입!");
									System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
									System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
									System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
									System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
									System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
								}else { //목소리 2번
									System.out.println("알쏭달쏭 불가사의한 타입!");
									System.out.println("많은 과학의 세계가 인간에 관해 설명하고 있지만 아직도 그 답을 찾기는 어려운 것.");
									System.out.println("아마 당신도 그렇게 알 수 없는 부분을 갖고 있으며 자신이 그렇기 때문에 남도 그렇다고 생각한다.");
									System.out.println("당신은 누군가가 당신과 비슷하다고 얘기하면 싫어하는 스타일이며");
									System.out.println("독자적인 노선을 가고자 하지만 도대체 무얼 추구하는지는 알기가 힘들다.");
									System.out.println("바로 연기자 스타일이다.");
								}
							}else { //섹시 2번
								System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //농담 1번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}else { //농담 2번
									System.out.println("유쾌하고 활발한 타입!");
									System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
									System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
									System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
									System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
									System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
								}
							}
						}
					}else { //물건 2번
						System.out.print("공식행사나 친구들 사이에서 총무역할을 많이 한다(1.Yes/2.No) : ");
						num = sc.nextInt();
						if(num==1) { //총무 1번
							System.out.print("대부분 통화를 오래 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //통화 1번
								System.out.print("한 곳에 오래 앉아 있지 않는 편이라고 생각한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //한곳 1번
									System.out.println("매우 훌륭해 보이는 타입!");
									System.out.println("어디를 보아도 관록이 있고, 지위가 있는 훌륭한 사람으로 보입니다.");
									System.out.println("물론 이런 경우 관록은 중량이 아니라 인격을 말합니다.");
									System.out.println("당신을 처음 만난 상대방은 자신도 모르게 스스로를 낮추는 경우가 많지 않나요?");
									System.out.println("그만큼 당신의 위치가 확고하지만 여기서 주의할 것은 무서운 사람이라고 여겨질수 있는 것이다.");
									System.out.println("때로는 여유를 보여주도록 합시다!");
								}else { //한곳 2번
									System.out.println("언제나 즐겁고 귀여운 타입!");
									System.out.println("언제나 마음 속에 태양이 비추고 있는 것처럼 즐겁고 부드러운 성격의 소유자.");
									System.out.println("윗사람으로부터는 귀염을 받고, 동료들과는 친하게, 후배들로부터는 신뢰를 받는다.");
									System.out.println("원만한 성격이라는 말치레가 어울린다.");
									System.out.println("그러나, 즐거워 하기에는 아직 성급하다.");
									System.out.println("이런 장점은 이성에게 매력으로 보이기 힘들다. 왜냐하면 연애에는 위험한 향기가 필요하기 때문이다.");
								}
							}else { //통화 2번
								System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //책상 1번
									System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
									num = sc.nextInt();
									if(num==1) { //농담 1번
										System.out.println("왠지 까다롭게 느껴지는 타입!");
										System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
										System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
										System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
										System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
										System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
									}else { //농담 2번
										System.out.println("유쾌하고 활발한 타입!");
										System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
										System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
										System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
										System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
										System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
									}
								}else { //책상 2번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}
							}
						}else { //총무 2번
							System.out.print("자신의 책상은 언제나 정리정돈 한다(1.Yes/2.No) : ");
							num = sc.nextInt();
							if(num==1) { //책상 1번
								System.out.print("농담을 잘 하지 못해 고민이다(1.Yes/2.No) : ");
								num = sc.nextInt();
								if(num==1) { //농담 1번
									System.out.println("왠지 까다롭게 느껴지는 타입!");
									System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
									System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
									System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
									System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
									System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
								}else { //농담 2번
									System.out.println("유쾌하고 활발한 타입!");
									System.out.println("모두 즐거워 하는 태양과 같이 유쾌한 사람.");
									System.out.println("당연히 주변에 모이는 사람도 많을 것이다.");
									System.out.println("서비스 정신이 넘치는 당신은 찾아온 사람을 절대 거절하지 못하는 성격을 지니고 있다.");
									System.out.println("다소 염려스러운 것은 그런 성격에서 오는 피곤함이다.");
									System.out.println("당신도 한 사람의 인간이기 때문에 좋지 않은 날에는 무리하지 말고 다른사람에게 의지해 보시기 바랍니다.");
								}
							}else { //책상 2번
								System.out.println("왠지 까다롭게 느껴지는 타입!");
								System.out.println("어딘지 모르게 고고함과 엄격함이 보이는 타입이다.");
								System.out.println("자기 스스로는 평범한 표정을 하고 있다고 생각하지만 타인들은 어려워하고 있다.");
								System.out.println("당신을 처음 만나는 상대방은 당신을 보고 어려워한다.");
								System.out.println("무얼 얘기하면 좋을까하고 초조하면 초조할수록 마음이 급해져 더욱 초조해진다.");
								System.out.println("악순환에서 깨어 남의 얘기에 장단을 맞추는 것도 좋은 방법 중 하나이다.");
							}
						}
					}
				}
			}
		}
	}

}
