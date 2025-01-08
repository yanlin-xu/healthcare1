import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import tijianjieguo from '@/views/modules/tijianjieguo/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import tijiantaocan from '@/views/modules/tijiantaocan/list'
    import config from '@/views/modules/config/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import tijianleixing from '@/views/modules/tijianleixing/list'
    import tijianxiangmu from '@/views/modules/tijianxiangmu/list'
    import tijianyuyue from '@/views/modules/tijianyuyue/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '体检资讯',
        component: news
      }
      ,{
	path: '/tijianjieguo',
        name: '体检结果',
        component: tijianjieguo
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '客服信息',
        component: chat
      }
      ,{
	path: '/tijiantaocan',
        name: '体检套餐',
        component: tijiantaocan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/tijianleixing',
        name: '体检类型',
        component: tijianleixing
      }
      ,{
	path: '/tijianxiangmu',
        name: '体检项目',
        component: tijianxiangmu
      }
      ,{
	path: '/tijianyuyue',
        name: '体检预约',
        component: tijianyuyue
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
