package com.vormela.config;

/**
 * 资源服务配置
 *
 *
 */
//@EnableResourceServer
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfig {//extends ResourceServerConfigurerAdapter {

//	@Override
//	public void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable().exceptionHandling()
//				.authenticationEntryPoint(
//						(request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
//				.and().authorizeRequests()
//				.antMatchers(PermitAllUrl.permitAllUrl("/ad/**")).permitAll() // 放开权限的url
//				.anyRequest().authenticated().and().httpBasic();
//	}
//
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}
