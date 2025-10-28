package com.example.demo;  // 替换为您的实际包名

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Spring Boot Demo</title>
                <style>
                    body { 
                        font-family: 'Arial', sans-serif; 
                        margin: 0; 
                        padding: 20px; 
                        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
                        color: white;
                        min-height: 100vh;
                    }
                    .container { 
                        max-width: 800px; 
                        margin: 0 auto; 
                        background: rgba(255,255,255,0.1);
                        padding: 30px;
                        border-radius: 15px;
                        backdrop-filter: blur(10px);
                    }
                    h1 { 
                        text-align: center; 
                        margin-bottom: 30px;
                        font-size: 2.5em;
                    }
                    .status-badge {
                        background: #4CAF50;
                        color: white;
                        padding: 5px 15px;
                        border-radius: 20px;
                        font-size: 0.9em;
                    }
                    .endpoint { 
                        background: rgba(255,255,255,0.2); 
                        padding: 15px; 
                        margin: 10px 0; 
                        border-radius: 8px;
                        border-left: 4px solid #4CAF50;
                    }
                    a { 
                        color: #ffeb3b; 
                        text-decoration: none; 
                        font-weight: bold;
                    }
                    a:hover { 
                        text-decoration: underline; 
                    }
                    .section {
                        margin: 30px 0;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>🚀 Spring Boot 应用运行成功！</h1>
                    
                    <div style="text-align: center; margin-bottom: 30px;">
                        <span class="status-badge">✅ 状态: 运行正常</span>
                    </div>
                    
                    <div class="section">
                        <h2>📊 应用信息</h2>
                        <p><strong>部署环境</strong>: Kubernetes</p>
                        <p><strong>访问方式</strong>: NodePort</p>
                        <p><strong>健康状态</strong>: <a href="/actuator/health">查看详情</a></p>
                    </div>
                    
                    <div class="section">
                        <h2>🔧 监控端点</h2>
                        <div class="endpoint">
                            <a href="/actuator/health">/actuator/health</a> - 应用健康状态
                        </div>
                        <div class="endpoint">
                            <a href="/actuator/info">/actuator/info</a> - 应用基本信息
                        </div>
                        <div class="endpoint">
                            <a href="/actuator/env">/actuator/env</a> - 环境变量和配置
                        </div>
                        <div class="endpoint">
                            <a href="/actuator/metrics">/actuator/metrics</a> - 性能指标
                        </div>
                        <div class="endpoint">
                            <a href="/actuator">/actuator</a> - 所有可用端点
                        </div>
                    </div>

                    <div class="section">
                        <h2>🎯 测试接口</h2>
                        <div class="endpoint">
                            <a href="/api/hello">/api/hello</a> - Hello API 测试
                        </div>
                        <div class="endpoint">
                            <a href="/api/status">/api/status</a> - 应用状态 API
                        </div>
                    </div>
                </div>
            </body>
            </html>
            """;
    }
}