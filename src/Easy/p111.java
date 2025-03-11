package Easy;

import java.util.Scanner;

public class p111 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] config = new String[] {"1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p"};
			boolean[] lleno = new boolean[19];
			String linea = sc.next();
			if(linea.equals("Exit"))
				break;
			int n = sc.nextInt();
			if(n/2 == 0) {
				config[0] += n%2;
				lleno[0] = true;
			}
			if(n/2 > 0) {
				config[0] += 2;
				lleno[0] = true;
				n -= 2;
				
				if(n/2 == 0&& n%2!=0) {
					config[1] += n%2;
					lleno[1] = true;
				}
				if(n/2 > 0) {
					config[1] += 2;
					lleno[1] = true;
					n -= 2;
					
					if(n/6 == 0&& n%6!=0) {
						config[2] += n%6;
						lleno[2] = true;
					}
					if(n/6 > 0) {
						config[2] += 6;
						lleno[2] = true;
						n -= 6;
						
						if(n/2 == 0&& n%2!=0) {
							config[3] += n%2;
							lleno[3] = true;
						}
						if(n/2 > 0) {
							config[3] += 2;
							lleno[3] = true;
							n -= 2;
							
							if(n/6 == 0&& n%6!=0) {
								config[4] += n%6;
								lleno[4] = true;
							}
							if(n/6 > 0) {
								config[4] += 6;
								lleno[4] = true;
								n -= 6;
								
								if(n/2 == 0&& n%2!=0) {
									config[5] += n%2;
									lleno[5] = true;
								}
								if(n/2 > 0) {
									config[5] += 2;
									lleno[5] = true;
									n -= 2;
									
									if(n/10 == 0&& n%10!=0) {
										config[6] += n%10;
										lleno[6] = true;
									}
									if(n/10 > 0) {
										config[6] += 10;
										lleno[6] = true;
										n -= 10;
										
										if(n/6 == 0&& n%6!=0) {
											config[7] += n%6;
											lleno[7] = true;
										}
										if(n/6 > 0) {
											config[7] += 6;
											lleno[7] = true;
											n -= 6;
											
											if(n/2 == 0&& n%2!=0) {
												config[8] += n%2;
												lleno[8] = true;
											}
											if(n/2 > 0) {
												config[8] += 2;
												lleno[8] = true;
												n -= 2;
												
												if(n/10 == 0&& n%10!=0) {
													config[9] += n%10;
													lleno[9] = true;
												}
												if(n/10 > 0) {
													config[9] += 10;
													lleno[9] = true;
													n -= 10;
													
													if(n/6 == 0&& n%6!=0) {
														config[10] += n%6;
														lleno[10] = true;
													}
													if(n/6 > 0) {
														config[10] += 6;
														lleno[10] = true;
														n -= 6;
														
														if(n/2 == 0&& n%2!=0) {
															config[11] += n%2;
															lleno[11] = true;
														}
														if(n/2 > 0) {
															config[11] += 2;
															lleno[11] = true;
															n -= 2;
															
															if(n/14 == 0&& n%14!=0) {
																config[12] += n%14;
																lleno[12] = true;
															}
															if(n/14 > 0) {
																config[12] += 14;
																lleno[12] = true;
																n-= 14;
																
																if(n/10 == 0&& n%10!=0) {
																	config[13] += n%10;
																	lleno[13] = true;
																}
																if(n/10 > 0) {
																	config[13] += 10;
																	lleno[13] = true;
																	n -= 10;
																	
																	if(n/6 == 0&& n%6!=0) {
																		config[14] += n%6;
																		lleno[14] = true;
																	}
																	if(n/6 > 0) {
																		config[14] += 6;
																		lleno[14] = true;
																		n -= 6;
																		
																		if(n/2 == 0&& n%2!=0) {
																			config[15] += n%2;
																			lleno[15] = true;
																		}
																		if(n/2 > 0) {
																			config[15] += 2;
																			lleno[15] = true;
																			n -= 2;
																			
																			if(n/14 == 0&& n%14!=0) {
																				config[16] += n%14;
																				lleno[16] = true;
																			}
																			if(n/14 > 0) {
																				config[16] += 14;
																				lleno[16] = true;
																				n-= 14;
																				
																				if(n/10 == 0&& n%10!=0) {
																					config[17] += n%10;
																					lleno[17] = true;
																				}
																				if(n/10 > 0) {
																					config[17] += 10;
																					lleno[17] = true;
																					n -= 10;
																					
																					if(n/6 == 0&& n%6!=0) {
																						config[18] += n%6;
																						lleno[18] = true;
																					}
																					if(n/6 > 0) {
																						config[18] += 6;
																						lleno[18] = true;
																						n -= 6;
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			String text = "";
			for(int i = 0; i < 19; i++) {
				if(!lleno[i])
					break;
				text += config[i] + " ";
			}
			
			System.out.println(text.trim());
		}
		sc.close();
	}
}
