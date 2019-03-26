/**
 * 
 */
package cn.zzu.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zzu.spring.boot.blog.domain.Authority;
import cn.zzu.spring.boot.blog.repository.AuthorityRepository;

/**
 * Authority 服务.
 * 
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}

}
