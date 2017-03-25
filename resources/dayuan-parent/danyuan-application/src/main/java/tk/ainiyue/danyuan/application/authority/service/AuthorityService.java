package tk.ainiyue.danyuan.application.authority.service;

import java.util.List;

import tk.ainiyue.danyuan.application.authority.po.Authority;
import tk.ainiyue.danyuan.application.authority.vo.AuthorityVO;
import tk.ainiyue.danyuan.application.authority.vo.AuthorityzTreeVO;

/***
 * 文件名 ： AuthorityService.java
 * 包 名 ： tk.ainiyue.danyuan.application.datacentor.authority.service
 * 描 述 ：菜单编辑
 * 作 者 ： Tenghui.Wang
 * 时 间 ： 2016年10月15日 上午11:05:03
 * 版 本 ： V1.0
 */
public interface AuthorityService {
	/**
	 * 方法名： findAll
	 * 功 能： 获取所有
	 * 参 数： @return
	 * 返 回： List<Authority>
	 * 作 者 ： Tenghui.Wang
	 * @throws
	 */
	List<Authority> findAll();
	
	/**
	 * @return
	 * 方法名： save
	 * 功 能： 保存
	 * 参 数： @param authority
	 * 返 回： void
	 * 作 者 ： Tenghui.Wang
	 * @throws
	 */
	public AuthorityzTreeVO save(Authority authority);
	
	/**
	 * 方法名： findAllByF_ParentId
	 * 功 能： 获取tree
	 * 参 数： @param id
	 * 参 数： @return
	 * 返 回： List<AuthorityVO>
	 * 作 者 ： wang
	 * @throws
	 */
	public List<AuthorityVO> findAllByF_ParentId(String id);
	
	/**
	 * 方法名： findzTreeByF_ParentId
	 * 功 能：获取ztree
	 * 参 数： @param string
	 * 参 数： @return
	 * 返 回： List<AuthorityVO>
	 * 作 者 ： wang
	 * @throws
	 */
	List<AuthorityzTreeVO> findzTreeByF_ParentId(String string);
	
	/**
	 * 方法名： findAuthorityByUuid
	 * 功 能： find
	 * 参 数： @param authority
	 * 参 数： @return
	 * 返 回： Authority
	 * 作 者 ： wang
	 * @throws
	 */
	Authority findAuthorityByUuid(Authority authority);
	
	/**
	 * 方法名： deleteAuthority
	 * 功 能： delete
	 * 参 数： @param authority
	 * 参 数： @return
	 * 返 回： void
	 * 作 者 ： wang
	 * @throws
	 */
	void deleteAuthority(Authority authority);
	
	/**
	 * 方法名： updateAuthorityName
	 * 功 能： 更新名称
	 * 参 数： @param authority
	 * 参 数： @return
	 * 返 回： AuthorityzTreeVO
	 * 作 者 ： wang
	 * @throws
	 */
	AuthorityzTreeVO updateAuthorityName(Authority authority);
	
	/**
	 * 方法名： onDropAuthority
	 * 功 能： TODO(这里用一句话描述这个方法的作用)
	 * 参 数： @param authorityzTreeVO
	 * 参 数： @return
	 * 返 回： AuthorityzTreeVO
	 * 作 者 ： wang
	 * @throws
	 */
	AuthorityzTreeVO onDropAuthority(Authority authority);
	
}
